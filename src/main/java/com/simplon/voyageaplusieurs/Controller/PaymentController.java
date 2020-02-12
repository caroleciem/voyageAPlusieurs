package com.simplon.voyageaplusieurs.Controller;

import com.simplon.voyageaplusieurs.Service.StripeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PaymentController {
    // Reading the value from the application.properties file
    @Value("${stripe.keys.public}")
    private String stripePublicKey;

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("amount", 50 * 100); // In cents
        model.addAttribute("stripePublicKey", stripePublicKey);
        return "index";
    }

    @Autowired
    private StripeService stripeService;

    @RequestMapping(value = "/charge", method = RequestMethod.POST)
    public String chargeCard(HttpServletRequest request) throws Exception {
        String token = request.getParameter("stripeToken");
        Double amount = Double.parseDouble(request.getParameter("amount"));
        stripeService.chargeNewCard(token, amount);
        return "result";
    }
}

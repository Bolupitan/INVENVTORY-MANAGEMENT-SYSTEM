package com.stockhub.InventoryManagementSystem.notification;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

public class TemplateService {
    private final TemplateEngine templateEngine;
    public TemplateService (TemplateEngine templateEngine){
        this.templateEngine = templateEngine ;
    }
    public String buildRegistrationEmail(String name) {
        Context context = new Context();
        context.setVariable("name", name);

        return templateEngine.process("Registration successfully", context);
    }

}

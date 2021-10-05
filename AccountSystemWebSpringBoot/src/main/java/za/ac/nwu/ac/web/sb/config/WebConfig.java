package za.ac.nwu.ac.web.sb.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//@Configuration
@ComponentScan(basePackages = {
        "za.ac.nwu.ac.web.sb.controller",
        "za.ac.nwu.ac.web.sb.exception",
        "za.ac.nwu.ac.AccountSystemLogic.flow"
})
public class WebConfig {
}


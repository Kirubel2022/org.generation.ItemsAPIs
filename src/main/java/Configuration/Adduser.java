package Configuration;

import org.springframework.context.annotation.Bean;

public class Adduser {
    @Bean
    public Adduser adduser(){
        return new Adduser();
    }
}


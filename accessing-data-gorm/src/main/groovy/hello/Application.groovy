package hello

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.groovy.template.GroovyTemplateAutoConfiguration
import org.springframework.context.annotation.ComponentScan

@EnableAutoConfiguration(exclude = GroovyTemplateAutoConfiguration) // see https://github.com/spring-projects/spring-boot/issues/2190
@ComponentScan
class Application {
    static void main(String[] args) {
        SpringApplication.run Application, args
    }
}

package io.github.victorhugonf.checklist.dao;

import io.github.victorhugonf.checklist.jpa.CheckList;
import io.github.victorhugonf.checklist.jpa.type.checklist.CheckItemJson;
import io.github.victorhugonf.checklist.jpa.type.checklist.CheckListJson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
    public CommandLineRunner initDatabase(CheckListRepository checkListRepository){
        String message = "Preloading %s";

        return args -> {
            log.info(String.format(message, checkListRepository.save(new CheckList("After take off",
                    new CheckListJson(new CheckItemJson("Gear up", false),
                                      new CheckItemJson("Flaps up", false))))));

            log.info(String.format(message, checkListRepository.save(new CheckList("Before landing",
                    new CheckListJson(new CheckItemJson("Flaps full", false),
                                      new CheckItemJson("Gear down", false),
                                      new CheckItemJson("Landing lights", false))))));
        };
    }
}

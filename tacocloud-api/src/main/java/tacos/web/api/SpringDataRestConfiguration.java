package tacos.web.api;

import org.springframework.context.annotation.Bean;
import org.springframework.hateoas.PagedModel;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import tacos.Taco;

//@Configuration
public class SpringDataRestConfiguration {

    @Bean
    public RepresentationModelProcessor<PagedModel<Taco>> tacoProcessor(EntityLinks links) {

        return pagedModel -> {
            pagedModel.add(
                    links.linkFor(Taco.class)
                            .slash("recent")
                            .withRel("recents"));

/*      pagedModel.add(
              links.linkFor(Taco.class)
                      .slash("dfjkgj")
                      .withRel("aaaaa"));*/
            return pagedModel;
        };
    }

}

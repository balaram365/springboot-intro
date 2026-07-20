constrcutor injection done
qualifier
primary for default qualifier @Primary
lazy-initialization
bean scopes
java-config-bean
@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}

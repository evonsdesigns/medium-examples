import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PojoMapper {
    private ObjectMapper mapper;
    public PojoMapper() {
        mapper = new ObjectMapper();
        mapper.configure(
                MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, 
                true
        );
    }
    
    protected ObjectMapper getMapper() {
         return mapper;
    }
}

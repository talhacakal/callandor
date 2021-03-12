package Languages;

public class turkish implements ILanguages{
    private final String dictionaryUrl="https://dictionary.cambridge.org/us/dictionary/english-turkish/";
    private final String text="Turkish";

    @Override
    public String getDictionaryUrl() {
        return dictionaryUrl;
    }

    @Override
    public String getText() {
        return text;
    }
    
    

}

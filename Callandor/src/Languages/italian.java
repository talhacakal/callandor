package Languages;

public class italian implements ILanguages{
    private final String dictionaryUrl="https://dictionary.cambridge.org/us/dictionary/english-italian/";
    private final String text="Italian";

    @Override
    public String getDictionaryUrl() {
        return dictionaryUrl;
    }

    @Override
    public String getText() {
        return text;
    }
    
    

}

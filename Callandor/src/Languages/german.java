package Languages;

public class german implements ILanguages{
    private final String dictionaryUrl="https://dictionary.cambridge.org/us/dictionary/english-german/";
    private final String text="German";

    @Override
    public String getDictionaryUrl() {
        return dictionaryUrl;
    }

    @Override
    public String getText() {
        return text;
    }
    
    
}

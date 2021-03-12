package Languages;

public class french implements ILanguages{
    private final String dictionaryUrl="https://dictionary.cambridge.org/dictionary/english-french/";
    private final String text="French";

    @Override
    public String getDictionaryUrl() {
        return dictionaryUrl;
    }

    @Override
    public String getText() {
        return text;
    }
    
    

}

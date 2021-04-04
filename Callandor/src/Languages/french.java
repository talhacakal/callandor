package Languages;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class french implements ILanguages {

    private final String dictionaryUrl = "https://dictionary.cambridge.org/dictionary/english-french/";
    private final String text = "French";
    private final int index = 3;

    @Override
    public String getDictionaryUrl() {
        return dictionaryUrl;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public String translate(String english) {
        String result = "";
        try {
            Document doc = Jsoup.connect(getDictionaryUrl() + english + "").get();
            Elements element = doc.select("div.sense-body");

            if (english.equals("callandor") == true || english.equals("Callandor") == true) {
                return "<b>This word is name of a sword in the wheel of time series.</b>";
            } else if (element.size() == 0) {
                return "<b>No result</b>";
            }

            boolean first = false;
            for (int i = 0; i < element.size(); i++) {
                String header = element.get(i).select("div.def").text();
                if (header.equals("") == false) {
                    if (first == true) {
                        result += "<br>";
                    }
                    result += "<b>" + header + "</b><br>";
                    first = true;
                }
                result += element.get(i).select("span.trans").text() + "<br>";
            }

        } catch (IOException ex) {
            Logger.getLogger(turkish.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

}

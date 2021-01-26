package important.adapter;

public class TranslatorAdapter implements VietnameseTarget {
    private JapaneseAdaptee japaneseAdaptee;

    public TranslatorAdapter(JapaneseAdaptee adaptee) {
        this.japaneseAdaptee = adaptee;
    }

    @Override
    public void send(String words) {
        System.out.println("Reading Words ...");
        System.out.println(words);
        String vietnameseWords = this.translate(words);
        System.out.println("Sending Words ...");
        japaneseAdaptee.receive(vietnameseWords);
    }

    private String translate(String vietnameseWords) {
        System.out.println("Translated!");
        return "こんにちは";
    }
}

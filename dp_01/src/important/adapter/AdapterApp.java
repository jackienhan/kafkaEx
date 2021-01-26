package important.adapter;

public class AdapterApp {
    public static void main(String[] args) {
        VietnameseTarget vietnameseTarget = new TranslatorAdapter(new JapaneseAdaptee());
        vietnameseTarget.send("Xin Chao!");
    }
}

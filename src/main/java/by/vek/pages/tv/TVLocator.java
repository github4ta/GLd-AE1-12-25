package by.vek.pages.tv;

public class TVLocator {

    public static final String TV_CATEGORY_HEADER_BUTTON = "(//a[@href=\"/tv/?filter%5B224869%5D%5Bfrom%5D=50\"])[2]";
    public static final String TV_PAGE_TITLE = "//h1[@class=\"style_title__QomyX\"]";
    public static final String TV_PAGE_CATEGORY_CONTENT_TITLE = "//h2[@class=\"ListingCategoryContent_title__Vs4Gm Title-module__title Title-module__h2\"]";
    public static final String TV_PAGE_ITEMS_CONTAINER = "//span[@class=\"CardInfo_text__GGroD ListingProductV2_infoText__kyxqB Text-module__text Text-module__caption Text-module__ellipsis\"]";
    public static final String TV_PAGE_SHOW_ALL_BRAND_BUTTON = "//div[@data-testid=\"producerBlock\"]//button[contains(@class, \"BaseMultiSelect-module__selectBtn\")]";
    public static final String TV_PAGE_BRAND_FILTER = "//label[@class=\"BaseCheckBox-module__label\"]";
}

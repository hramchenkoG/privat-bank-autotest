package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Page {

    MAIN_PAGE("https://next.privat24.ua/?lang=en"),
    PAYMENTS_MAIN_PAGE("https://next.privat24.ua/payments/?lang=en");

    private final String uri;
}

package ru.auto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class AutoRuTest {

    @Test
    public void testSearch() {
        String body = given().
                header("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/138.0.0.0 Safari/537.36").
                header("Cookie", "suid=673373febfe5475b3145625f42165a66.a6435c9d7a21b28380aaa1b78c3dd5ab; _csrf_token=7e23384ee8c8bf62144401df996f4b5d068001e294c781f0; autoruuid=g687fd5322hj3oqgitq1uo12jvdo4ao6.6591c352693a92d9096d6080b7853d31; from=direct; autoru_sso_blocked=1; Session_id=3:1753208115.5.0.1749031377224:q-w1Lg:1fa9.1.2:1|1566726707.0.2.3:1749031377|61:11011207.728531.B9bIKWAl5Iga41D4210z-iwKfdY; sessar=1.1204.CiC8rokdl0t6g7Buor3n9U8dku_DHaSSQUd-o8SkB7Fr3w._HQDeRnlRLIVm6kjYy8InsBGIKvbUWBH3e7s7wg7wiM; yandex_login=sergei.tsarik.by; ys=udn.cDpzZXJnZWkudHNhcmlrLmJ5#c_chck.402360769; i=l/aVFwhbbi1p/6LeZVNTFKq/VkDWOpNDp5LeeOh+g3MjTWBC/w5LUlAXp0KFoCCq0EFeFUpHFjxc9iizJEOSJJTrsPE=; yandexuid=8901320751670529324; my=YycCAAMA; L=cw1UdmN5DnBUYFJVA1B0cXZiSWQFXQNWPig5JhQ7ZiZEDycbHmIsQQ==.1749031377.16172.344137.3138d9bebad5b20d1a0a725d1abb48ea; mda2_beacon=1753208115180; sso_status=sso.passport.yandex.ru:synchronized; autoru_sso_redirect_blocked=1; autoru_sid=143566715%7C1753208115881.7776000.zfXcOJA9NKtEsMuuw9xbIg.gSPP4zJbogJmTWFBy4dH3UW5f_bkk6zh_3uYLy6TMOU; _ym_uid=1748374706856795198; _ym_isad=2; yaPassportTryAutologin=1; garage_card_actualization_popup_143566715=1; fp=b6ffefca9665a361223f59afb9d9935d%7C1753208117932; _yasc=HTr4Apo4bnTLBNerEp75K9jUsQ6LVIcraP0sML/4gvqzAH1RUV8Z7FNHpZrZm93Kcbeg; geo_onboarding_shown=true; autoru-visits-count=1; autoru-visits-session-unexpired=1; gdpr=0; _ym_d=1753208477; autoru_crashreport={%22route_name%22:%22listing%22%2C%22app_id%22:%22af-desktop-search%22%2C%22time_spent%22:%221%22%2C%22chat_indicator_unread%22:false}; count-visits=11; from_lifetime=1753208481670; layout-config={\"screen_height\":720,\"screen_width\":1280,\"win_width\":1265,\"win_height\":166}; cycada=pyOzGX+XCifS4XSV5X1NtHgI+vsPtMzknlphivvaYYc=").
        when().
                get("https://auto.ru/cars/bmw/all/?query=bmw&from=searchline").
        then().
                extract().body().asString();

        Assertions.assertTrue(body.contains("BMW X5 35i III (F15)"), "Поиск не содержит - BMW X5 35i III (F15)");
    }
}

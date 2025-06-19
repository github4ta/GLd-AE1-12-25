package com.pinterest.api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;


public class CreatePage {
    private final static String LOGIN = "\"test@test.com\"";
    private final static String PASSWORD = "\"Qazxc1478\"";



    public static Response getResponseLoginRequest() {

        return given()
                .header("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7")
                .header("x-csrftoken", "0507c07e8b54b1980712d0d8330cfa6b")
                .header("Cookie", "ar_debug=1; csrftoken=0507c07e8b54b1980712d0d8330cfa6b; _pinterest_sess=TWc9PSZ3YUs3emlZVUVUTUI0VmJZazh6MmtvTUZFeDBoTkdxN29KaGhUTHNTdi9zTmtmODdEV0NZL0Z1clFYRkdGU09NNDVzZ3NOcng3U0tEdFV0ejRhRUNtb0xKZDFBd3IyNzBaY2s5eURxblU4VT0maExDYmF6Y0ZiVEFFWTFISkZOZTFPNHNWTFhNPQ==; _auth=0; _b=\"AYg4a6RnkMFG574YvLlmaMVYqMz7LxmRnir8f3Dvfc9H/aOBX3g8AkYhQeK6FRIuiPY=\"; _routing_id=\"f565f994-4732-41a0-96a3-90139c4eb0ec\"; sessionFunnelEventLogged=1; _dd_s=logs=1&id=5421739a-5bf6-4f30-86ce-7d9ab95f7654&created=1748871367307&expire=1748872267307")
                .formParam("source_url", "/")
                .formParam("data", "{\"options\":{\"username_or_email\":" + LOGIN + ",\"password\":" + PASSWORD + ",\"app_type_from_client\":5,\"visited_pages_before_login\":\"[{\\\"path\\\":\\\"/\\\",\\\"pageType\\\":\\\"home\\\",\\\"ts\\\":1748528487017}]\",\"recaptchaV3Token\":\"HFaHBiewlENXUKZUBXRlpGRxNjCQ9gHgUHEHoQPCttaXkjHSN0K3UXam8GcytLY30hFykFDANgDAMWM1dMKDYDCX11EVIvYwcka0QtK2hKTCU9PXEgCnd1Mg87exQRGl1MSSpfF3JlCRBtfwk0RxwUK2gUUChAWVE7EjJqEQ9VeA5zR0lWDAMRDAQSCw9gHhECFnIaTV44DiRXHGsBcUZgFSUBTzBAZDlnA19CSmVPfVJOGVRQaRJQb1Vgdnk4GTsRVV5zHkgdQg9_CnQ_cE4oO3tmc0UXfV4aTBcCSzgPQ3VYHGNFUToZblJxRA5cShlrdRNJJF9gYQENZlxCbUIVTng5QllhGg1hdQBka30sADNQZEUyNFJxNzkQey8ZPz0XXHZWQH1gdmYdF2QALRpxS3FpR0FLBBAbJWk3LndHaXQ2aHQ3VVNZMx8kVXoRSAdgaDBJXiYAQ0NgD35eYWRhPmAYahJ8cVc6MXA9KnBzIg9JcRAScFVkREEkcXhgDX51YwhYbUwCFiRsfHZjc1JZbRAabBNWSH4kdGh-GWQaXnYUGmFNMHJfe3sJT1hNJSgQTVppF2VUXAgLIXcccSIqNE9sTnJ0fVB5YBBfAw8WZkZiIndHRD84OHBVXSFKeW47IBNkP01RfC5KYHFiWnBIG25jelsEaHxJSDBbZVofBhJDRkgLWnxHDDQmazNlRnINaihkbX5SaH58PxF1DhZDblMccXViBxEfbntiMUJ0YRULIVFjZSNtJ1s8fmtmXElMRjNnagI7T05tMFFURD4XLU13SHYnYlcDNHZpKgRXJjBxRmBsS0d6X2QAX0MmJAFfQyRZXkktHHIhGFI4UQVBNCc4QCFEQ0Y0RiJGWHtiGGF8EVd8By9JUncYFHhDJiQ1TQRuGXQUfCo8aWAmfSc3aX1oRVxLSEJZegsFRQ0IHG90L1R_VWQha0NWWnpddn9hFiRSHX8yaDBLeV1QQFxSaFUkVW02J11mcxV-U0IQNzlmYHthLmkBaDUFLXIZeHkzBENxeQlXQHhHCXxPEA9WTFcYG1pzBCMKLQtJOTZvXQMWN2ULE3lFbWVhWFpAZAZqWxJCRxQSXg9PEXxRaCU7KEN3SnFkXlgIBDAnPUkrIjFzM0p2H0RvXX8kSWI_N2RnFxBeOGEBN3MuQEk6amRrIho2Qh9CR0YtQEt4bkIOSAZiY2INOw4TfksTe3xDBSs2eF5lCVhzTXUONncAfm5pCXVaZVpEZgVuWxRAZRINSWxvHA11NwgFAFBOYTQjbEthKgNBElVMXD1AM39xHlxhX3Q_cB1qEBl-EjRcaGg4YC9bUVQpfUdVbC8ibT5HXG4NWFBdHQhVWltxD3t1OT1rU3kYbyR9FzNnZHw1anFGdBZ_K0ozcX9vAExYEEcRX0FVShpdRgUWGGNXKWRROQEbP1VXSnp7VkQ5Bip9bn1rISZ_YlRIXHREZVwwUn1gOFYEXDpkY0csDBJcdHcBKgBdawknLyx8aE0YBm9ZWHp0WnNHEHwIDyleC1BkZF9mKSUya1FyE0sWTzR3KXEfCSUoKkV8UGQaRUZkbxdiH3EDHWccCHBEM2Q4AXUSXCcnd1owfXFeG3JZch9fMkpweVZlRgY6XE0hAnAdHSwRY1ZtNgZHRGY2VGRjFWliexNDZF0fakNUGAJXdlsQI1ZKK3B3anIxEF5fJyAHQwRRLEhCaQgmN1UnZnBsLRxrdVppSGVrT3FydBkiXHsDM3R-cA41HlVSbSt4XmogDQNHBEhlewEAaGR2HXlbRmE3cGcDbBkHShNbQXo_LR5BRkQXdgZUCiskVgJ8SUxsC1IEQAV1fRxqa0JKCHF5QnEcbCwyKwVlLEFyI0pBcwwcPkcAQ1hJLXNdW0BKXnhGYAIcV3IvYEZUPWM0R3pkHlx0bhFjVHE3BAdyHF5_X35NaGtJTwl5G2RjXUImKgN0dCdffHo8aHR5H3UCVkdrLy44cSpAdkcTZ1pxcEFaT0cXIWZiNzBhdXkgbHw6PHdjLVlmY1t-CDB2PFQ8SmN5JxlKZ0B7S1wQA3ViWgQWdlVDKXJkdyw3EWdJOQYlZHg6PDd3Mklke3BRMBJQT2tvG0QWbkxkFW0JTQRgR2kuMABBZF0jfAJ-LxNmcTRAX38xZUpmaFhXZkVWbU90DgBzTGkzaWE7HQghK3tpLTJpewcYHlsSSmdXKk0xBGVyDAMRC3Z1\"},\"context\":{}}")
                .when().post("https://www.pinterest.com/resource/UserSessionResource/create/");
    }

    public static Response getResponseCreateAccount() {

        return given()
                .header("Content-Type", "application/x-www-form-urlencoded")
              //  .header("Content-Length", response.getHeader("Content_Length"))
               // .header("Host", "<calculated when request is sent>")
                .header("accept-language", "ru,en;q=0.9,en-GB;q=0.8,en-US;q=0.7")
                .header("x-csrftoken", "25e33405e8dd0100929ce9462f354ac2")
                .header("Cookie", "csrftoken=25e33405e8dd0100929ce9462f354ac2; _pinterest_sess=TWc9PSZwTzJwUlEyQndNN3FXU3JiVnlESEpYNVlFZUxSYWNXZURkSnkwUm1OT3RWWVlabGQvNmYyZG85cWFTOFRRcDhQclZneWN0dXNsQW5EcnM0NE5EOWV2ek5tTzFOTzZJRkdwVjNtdGs2VHhCaz0mUllFdVBKTytkZlZQWEpZNHlSZC9qTmNNVGJ3PQ==; _auth=0; _routing_id=\"101785fc-7fd6-4f14-8b8d-42d909f3c7a8\"; sessionFunnelEventLogged=1; g_state={\"i_p\":1750270149886,\"i_l\":1}; _b=\"AYmUNK75m95ECodU1Bfo1BH+uHO8gUgyHVCaTB4aW27AkmK5XG0JbG4JLQ8dhWe6cYU=\"")
                .formParam("source_url", "/?ysclid=mc25d645js617928489")
                .formParam("data", "{\"options\":{\"type\":\"email\",\"birthday\":-62121081600,\"email\":\"d.vasilenka+115@alcosi.eu\",\"password\":\"Qazxc1478\",\"country\":\"BY\",\"first_name\":\"D Vasilenka+\",\"last_name\":\"\",\"recaptchaV3Token\":\"03AFcWeA4uJTBouRpfcy4ArkGDNaf14g-PkjljfOSJQmY6Le42wFp6tOU_Doig0wNxHdhUhtDNIKNQ3N1ly_AOzAy4yjHRTSqXnt3CNTDdFAiezSTmNqHahmkcbGLGKFE3j42JgKWxv0TkqC5h0ma8vc19J8qDEWQvg3cw7xDBbpVGeT78c0fmYDsomK6FVmJkvATvK08nOMxUHwtwah8qkPCh8Os9VahCHtLmIhKL-HZLSs9Jdo2pHmtaT9k6i-UvRSOJdGpLvkcBS9R4z8O9xkq9mGWw66qZrgNOVgpQaaVjv07Q6-i-TMOrEx8MYNY-VKeHJYqstzmeDXIR1Symb0YBhQyfBtMQjQquDOxmm6MEHTqDGCqnW5M_pqO-Iu0Y9iNoQKAV5lZKk2SwLahLbBIH_NtWHklkie_ALu9AC9HgCGJp4jtmP1OVyr8vhMoOV5rl2mtJJWKVfiB1sgPVssfyXmOyG_Tg65U0WIBozF8JI6aR_mP2VVpbYCiGUZWCNneNnNEt1cREzGgJhTtnjraOV1jGcsmWQlD6RM-DYRFg7MuQRzRQGt6pWppIfGF_HlqbYrXDBPPVTogp2JNcL76_cYe8w4NafhdwD9aFFrl-16oKZAYEEhP51mVssBu3DXaeDxY_iS0ng24UmO5qL2EIkOFdW3f_07SxYItYHrmsEQ01N0IgGGxVeLy8VJssggEUnmbV5p1VF41MHEQdSmQrq6EfOjFcIbOF_ajONi4Oav8Kk9_nomFcRl5GWe82clVhwHZJUpptRCnExcJYAQFplalRIM1k6dWLK5ym6ELlGWoPiCLvNWlNgql8tJpra_rqeE3BqbGvZnDmiJVQBRLIkOC2sGMqCNcFqjGHbUzw0oQ7bVyfDpXlfIr3G75sTIH2PvktkMf0ZqMNI5RwjvLZo5GW9Zt3XXdsVxXx3amuywagtZTgKU_JaA6QpQOZLbIHD6x-BtkLWPTakDpPvows18-YH-OYXNxPKiCnV5u6SNhK0qY4l8kNouIqLcvKb3BbST-9L2ou1TTOxjDmyyUhfXffj5am8mKW3MMb6XalivN6kWQNKQw3WjtwRVDdnKnH0E6qu09cm8aQJC4yX3gPV8WWWsQZvBSeQBPAzLLQUDwkDa-nGPnJugGM1jOSBhBi3QPWuGOjS1iCc3lPWdeZh5wUHLFrrNrcfA9ytSOVPS0cN8c28fiGiuP1R27PsHzSfHax3ngzkqo4e7ftI7QBsx-HCRkLx2HkueJT4GgD_Jo7BOf7sxpxgC_cTXiKNmQMkkO3zdSa3baWOFvooDA5Ljf8nhFWNM6dXH5Jt6hzowFlcTroKCBd6DOFuYQt-988eIa7O4_4MEi5OEIPhpMOILM9uw-JhY9cq8MAU6KHFahIPqJ_7DJ61pT_aPsVD2FoYqmq1BXjF7oetf8C58ORe1P8qM-jQ6OyBtUTpYiTNBF8cfomqzGUBx6uwJpYpMvJxS_65y1rTFblNr6xPFeNxpHjs4QRD3wOYQTUoDXA4tsoaVo_sqCs4FpxNou7QYtM5zzJBTkARj8zIaDh74Yuf-Xy4GdhK-3vBEfyKwiSOPqurWzOv4g8C19esRor6M_isCfti4Lox_Clqu2H5jCPEQrUgHlTUidjuTyILm4dM-lioJcm4KTyjkZMMhHMO4ii9VrpWDZ18nFGO_vcMYVZU8IRF7fspumIa_9csn864QNAKS6r-rmp1BH86mNq2dSbne1aG8lTsMqmOq1nPyNZUSTOKGSqSuy6DoUCb9yDsJBZNe-Sfflj1ycdfUam6fUjp94YhoWK4HnNwVi3sr76m_Lyz26w5kyLInMX2Ga8r_HIVUlhzMF2ze95Kb7ePWvn_3SLBCVJh44LGEaH-M9a3F3YqS51QwPagTYSv-nD0RzlhGyHjB-_xCjI3lPEsSE6beQF2nw-rhPLI1QjYbqN8khMkgiu4fzYj1USXKNA-0tTtLJkmX6OnjOFOIqunAKKn1V1ED9XAquw6WeYU5lZjo01FtDIae5N6LOuaCo13zIRVH5u53DnV1Ak136XRQHCVOQA6890He9IlgtOa_0qii2cMK5w7Dz1HU-_teEi5X1Yx9-YGTqNMZwwhXxkNk2fPMB0hgGGrJU3AdtecWcVEIfrHt-MmKh1nGMq7zLUA9sJFPno3PkrTlTxxUl88oXN7RGUfJ8Rd-RKvDoF_slv3ZOpPx0RsWFPcHaGg2Iy6kDoNy26fdxyFjjjIe-oidBQ-R_9aKXZi7ZZANW0PwdeEAmkm2cgxqIS2Lq__8L68El5soCIUJTsUkBPltqbY8rL1_eFil2nvkg-GqLVQerb8SBFgNfm2kMFtt2Zruei64a0gKEAWIP1XdLWH9AodGcT46q2t6prGCbywHPzDcrAJrglyArd7fjxnNotVrlj2B9GUICUsm0QgoM4kNOtESEEAh1s_IGaB6ta8PJUNAJdn421IV36DZoaZUySaO1BtbMJ-L0e8_OEEV1eMkEY9ilS-mvxMImJm3hldYR-fwdYWtS9nzphJHuhw9l0WdTND2e0YJUOvWQmteO7M2j4PnwO4OJc5FHGo4DHBIJ3NkVBIPbRUKVyyO6IM1eEmKND5tyr1SNjGelLuMWeYe-hREV-qsrTRp8SJoU6est0WIeujoyDyfjmRn22mvQQtKWu9K9ooXBIt6DVZ4WKEYof0zc1sdJ1w1U4q-LuC83sUFmZCtahVzbpAqZZMk_o5_WmhcEw0rIb9R16iFta9jfeNAsrxYKIiEATGlUqau-MvfBnn6Cp5quN5Hje-12eAET8bijgu-bCYRazNKwzdmc-riZ1VhnaEV3c4aJXbtQEk2Ue733vKYSEZKlJFOtPmbCkg6J4rGI_g8FKPZJeEa-LyyfZIWdCqPcZ1FFQ2BVlO2jUP2bOodrI67vaLY-vgsIQN7IEsv1L_ssRRwJdecMqO6cj2QjuAEZg8Y3eYlc1JOCUjU7RZxqQXq7pPLmvT95cKfiQAlMuOgY1_BBpm6op3WPQ6MGLAmdhZxpuH2d0hHfqQIRKbGilZYBY8isL8QdS_KxbS-tHHiXJQkKA-q2hkJqrx6KVBs4hYIySvrXwUAGepNLktRS2sc-_V2pEta9emoMSlKufawIkLFQkDwDJ4-moy-YKxe2fTZug53fmFFSnxF7yQsPMiMLeZ5bnIQHZh2D43f0PNHwC6PIC0YAQ0HXb4b49f1-3XtjAoCbHdfZg5q-jQdIaeF6KNsM-Qa_qKj-Lkuz_RDTE0u4EYbBH72E6cdD3PZ_rpWQi30J-rx2LAiOGDjKLNGkkRwAHrAQ_WjWdTcoK7XWhw5LO8Khoxxb59EzyM8MpDBGsl14W12yiqhD3rJHf9FjdbDMW9iRfG4sEOCP2LJmCHQhqFd4wjY0ydd90SBy7P7PMD-azRz-JdJyi-r-2IkrOgTwTgY2f7RT6qH8CXOtGbfPJxlU-tOQ2uhCw2lH44u3BIeRY1X_5cssDYfgRi8HIlg-wfwReN5vAQxZi9fYXtv-y0nCwQYqPTlJrs3DW\",\"visited_pages\":\"[{\\\"path\\\":\\\"/\\\",\\\"pageType\\\":\\\"home\\\",\\\"ts\\\":1750262944523}]\",\"user_behavior_data\":\"{}\"},\"context\":{}}")
                .when().post("https://ru.pinterest.com/resource/UserRegisterResource/create/");
    }

    public static int getStatusCode(Response response) {
        return response.getStatusCode();
    }

    public static String getErrorStatusText(Response response) {
        return response.path("resource_response.error.status");
    }

    public static String getBrowserNameMessage(Response response) {
        return response.path("client_context.analysis_ua.browser_name");
    }

    public static String getCountryFromIp(Response response) {
        return response.path("client_context.country_from_ip");
    }

    public static String getPassword(Response response) {
        return response.path("resource.options.password");
    }
    public static String getErrorMessage(Response response) {
        return response.path("resource_response.error.message");
    }
}

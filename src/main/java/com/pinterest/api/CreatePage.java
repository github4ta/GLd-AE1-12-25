package com.pinterest.api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;


public class CreatePage {
    private static Response response;

    public CreatePage(){
        response=getResponse();
    }
    Response getResponse() {

        Response response = given()
                .header("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7")
                .header("x-csrftoken", "0507c07e8b54b1980712d0d8330cfa6b")
                .header("Cookie", "ar_debug=1; csrftoken=0507c07e8b54b1980712d0d8330cfa6b; _pinterest_sess=TWc9PSZ3YUs3emlZVUVUTUI0VmJZazh6MmtvTUZFeDBoTkdxN29KaGhUTHNTdi9zTmtmODdEV0NZL0Z1clFYRkdGU09NNDVzZ3NOcng3U0tEdFV0ejRhRUNtb0xKZDFBd3IyNzBaY2s5eURxblU4VT0maExDYmF6Y0ZiVEFFWTFISkZOZTFPNHNWTFhNPQ==; _auth=0; _b=\"AYg4a6RnkMFG574YvLlmaMVYqMz7LxmRnir8f3Dvfc9H/aOBX3g8AkYhQeK6FRIuiPY=\"; _routing_id=\"f565f994-4732-41a0-96a3-90139c4eb0ec\"; sessionFunnelEventLogged=1; _dd_s=logs=1&id=5421739a-5bf6-4f30-86ce-7d9ab95f7654&created=1748871367307&expire=1748872267307")
                .formParam("source_url", "/")
                .formParam("data", "{\"options\":{\"username_or_email\":\"test@test.com\",\"password\":\"Qazxc1478\",\"app_type_from_client\":5,\"visited_pages_before_login\":\"[{\\\"path\\\":\\\"/\\\",\\\"pageType\\\":\\\"home\\\",\\\"ts\\\":1748528487017}]\",\"recaptchaV3Token\":\"HFaHBiewlENXUKZUBXRlpGRxNjCQ9gHgUHEHoQPCttaXkjHSN0K3UXam8GcytLY30hFykFDANgDAMWM1dMKDYDCX11EVIvYwcka0QtK2hKTCU9PXEgCnd1Mg87exQRGl1MSSpfF3JlCRBtfwk0RxwUK2gUUChAWVE7EjJqEQ9VeA5zR0lWDAMRDAQSCw9gHhECFnIaTV44DiRXHGsBcUZgFSUBTzBAZDlnA19CSmVPfVJOGVRQaRJQb1Vgdnk4GTsRVV5zHkgdQg9_CnQ_cE4oO3tmc0UXfV4aTBcCSzgPQ3VYHGNFUToZblJxRA5cShlrdRNJJF9gYQENZlxCbUIVTng5QllhGg1hdQBka30sADNQZEUyNFJxNzkQey8ZPz0XXHZWQH1gdmYdF2QALRpxS3FpR0FLBBAbJWk3LndHaXQ2aHQ3VVNZMx8kVXoRSAdgaDBJXiYAQ0NgD35eYWRhPmAYahJ8cVc6MXA9KnBzIg9JcRAScFVkREEkcXhgDX51YwhYbUwCFiRsfHZjc1JZbRAabBNWSH4kdGh-GWQaXnYUGmFNMHJfe3sJT1hNJSgQTVppF2VUXAgLIXcccSIqNE9sTnJ0fVB5YBBfAw8WZkZiIndHRD84OHBVXSFKeW47IBNkP01RfC5KYHFiWnBIG25jelsEaHxJSDBbZVofBhJDRkgLWnxHDDQmazNlRnINaihkbX5SaH58PxF1DhZDblMccXViBxEfbntiMUJ0YRULIVFjZSNtJ1s8fmtmXElMRjNnagI7T05tMFFURD4XLU13SHYnYlcDNHZpKgRXJjBxRmBsS0d6X2QAX0MmJAFfQyRZXkktHHIhGFI4UQVBNCc4QCFEQ0Y0RiJGWHtiGGF8EVd8By9JUncYFHhDJiQ1TQRuGXQUfCo8aWAmfSc3aX1oRVxLSEJZegsFRQ0IHG90L1R_VWQha0NWWnpddn9hFiRSHX8yaDBLeV1QQFxSaFUkVW02J11mcxV-U0IQNzlmYHthLmkBaDUFLXIZeHkzBENxeQlXQHhHCXxPEA9WTFcYG1pzBCMKLQtJOTZvXQMWN2ULE3lFbWVhWFpAZAZqWxJCRxQSXg9PEXxRaCU7KEN3SnFkXlgIBDAnPUkrIjFzM0p2H0RvXX8kSWI_N2RnFxBeOGEBN3MuQEk6amRrIho2Qh9CR0YtQEt4bkIOSAZiY2INOw4TfksTe3xDBSs2eF5lCVhzTXUONncAfm5pCXVaZVpEZgVuWxRAZRINSWxvHA11NwgFAFBOYTQjbEthKgNBElVMXD1AM39xHlxhX3Q_cB1qEBl-EjRcaGg4YC9bUVQpfUdVbC8ibT5HXG4NWFBdHQhVWltxD3t1OT1rU3kYbyR9FzNnZHw1anFGdBZ_K0ozcX9vAExYEEcRX0FVShpdRgUWGGNXKWRROQEbP1VXSnp7VkQ5Bip9bn1rISZ_YlRIXHREZVwwUn1gOFYEXDpkY0csDBJcdHcBKgBdawknLyx8aE0YBm9ZWHp0WnNHEHwIDyleC1BkZF9mKSUya1FyE0sWTzR3KXEfCSUoKkV8UGQaRUZkbxdiH3EDHWccCHBEM2Q4AXUSXCcnd1owfXFeG3JZch9fMkpweVZlRgY6XE0hAnAdHSwRY1ZtNgZHRGY2VGRjFWliexNDZF0fakNUGAJXdlsQI1ZKK3B3anIxEF5fJyAHQwRRLEhCaQgmN1UnZnBsLRxrdVppSGVrT3FydBkiXHsDM3R-cA41HlVSbSt4XmogDQNHBEhlewEAaGR2HXlbRmE3cGcDbBkHShNbQXo_LR5BRkQXdgZUCiskVgJ8SUxsC1IEQAV1fRxqa0JKCHF5QnEcbCwyKwVlLEFyI0pBcwwcPkcAQ1hJLXNdW0BKXnhGYAIcV3IvYEZUPWM0R3pkHlx0bhFjVHE3BAdyHF5_X35NaGtJTwl5G2RjXUImKgN0dCdffHo8aHR5H3UCVkdrLy44cSpAdkcTZ1pxcEFaT0cXIWZiNzBhdXkgbHw6PHdjLVlmY1t-CDB2PFQ8SmN5JxlKZ0B7S1wQA3ViWgQWdlVDKXJkdyw3EWdJOQYlZHg6PDd3Mklke3BRMBJQT2tvG0QWbkxkFW0JTQRgR2kuMABBZF0jfAJ-LxNmcTRAX38xZUpmaFhXZkVWbU90DgBzTGkzaWE7HQghK3tpLTJpewcYHlsSSmdXKk0xBGVyDAMRC3Z1\"},\"context\":{}}")
                .when().post("https://www.pinterest.com/resource/UserSessionResource/create/");
        return response;
    }

    public static int getStatusCode() {
      return response.getStatusCode();
    }

    public static String getErrorStatusText(){
        return response.path("resource_response.error.status");
    }

    public static String getBrowserNameMessage(){
        return response.path("client_context.analysis_ua.browser_name");
    }

    public static String getCountryFromIp(){
        return response.path("client_context.country_from_ip");
    }
    public static String getPassword(){
        return response.path("resource.options.password");
    }
}

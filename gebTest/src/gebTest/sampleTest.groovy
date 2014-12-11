package gebTest;

@Grapes([
    @Grab("org.gebish:geb-core:latest.release"),
	@Grab("org.gebish:geb-spock:latest.release"),
	@Grab("org.seleniumhq.selenium:selenium-ie-driver:latest.release")
])

import geb.Browser
import org.junit.Test;

System.setProperty("webdriver.ie.driver", "driver/IEDriverServer.exe")

Browser.drive {
	go 'https://google.co.jp'
	$('input[type=text]').value('クックパッド')
}

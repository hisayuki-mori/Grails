package gebTest.def;

import geb.Browser
import org.junit.Test;

System.setProperty("webdriver.ie.driver", "driver/IEDriverServer.exe")

Browser.drive {
	go 'https://google.co.jp'
	$('input[type=text]').value('クックパッド')
}

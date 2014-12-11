package gebTest;

@Grapes([
    @Grab("org.codehaus.geb:geb-core:latest.release"),
	@Grab("org.seleniumhq.selenium:selenium-ie-driver:latest.release")
])


import geb.Browser

import org.junit.Test;

Browser.drive {
	go 'https://google.co.jp'
	$('input[type=text]').value('groovy')
	assert $('input[type=text]').value() == 'groovy'
}


package gebTest.spock;

import spock.lang.Specification
import geb.spock.GebSpec

class SampleSpec extends GebSpec  {

	def '名前を呼んで挨拶する'() {
		expect: say(name) == message
		where:
		name      | message
		'world'   | 'Hello, world!'
		'fumokmm' | 'Hello, fumokmm'
	}
  
}
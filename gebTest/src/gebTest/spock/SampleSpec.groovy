package gebTest.spock;


import geb.spock.GebSpec

class SampleSpec extends GebSpec  {

	def 'first result for wikipedia search should be wikipedia'() {
		given:
		go "http://yfj2.hateblo.jp/entry/2014/10/26/164629"
	}
  
}
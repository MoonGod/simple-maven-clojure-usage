(ns HelloTest
	(:use [clojure.test :only [run-tests deftest is]])
	(:use Hello))

(deftest first-test []
	(is (= "this" "this")))
	
(deftest second-test []
	(is (= (Greeting "zsp") "Hello zsp")))

(run-tests)


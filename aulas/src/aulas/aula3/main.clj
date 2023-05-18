(ns aulas.aula3.main
  (:require [aulas.aula3.confidential :as confidential]
            [clojure.pprint :as pprint]))

(defn salutation
  "Create salutation with some name"
  [name]
  (str "Welcome " name))

; Tests
(println "Exercise 1")
(println (salutation "Gabi"))

(println "")

(defn multiply
  "Multiply two numbers"
  ([num1]
   (multiply num1 num1))
  ([num1 num2]
   (* num1 num2)))

; Tests
(println "Exercise 2")
(println (multiply 2))
(println (multiply 2 3))

(println "")

(defn multiply-reduce
  "Receive some int and multiply it by the rest of the numbers list. Return a value of all numbers multiplied."
  [num & rest-nums]
  (reduce #(* %1 %2) num rest-nums))

(defn multiply-map
  "Receive some int and multiply it by the rest of the numbers list. Return the list with each number multiplied by num"
  [num & rest-nums]
  (map #(* % num) rest-nums))

; Tests
(println "Exercise 3")
(println (str "Reduce version: " (multiply-reduce 2 3 4 5)))
(print "Map version: ")
(println (multiply-map 2 3 4 5))

(println "")

(defn create-salutation
  "Return a salutation function"
  [salutation]
  (fn [name]
    (str salutation " " name)))

; Tests
(println "Exercise 5")
(println ((create-salutation "Hello") "Gabi"))

(println "")

; This function and symbol are private, so this following code must generate an error
; (confidential/get-password "Maria")
; (confidential/password-by-user)
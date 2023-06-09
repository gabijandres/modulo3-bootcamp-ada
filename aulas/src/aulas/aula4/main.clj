(ns aulas.aula4.main
  (:require [clojure.java.io :as io]))

(def names ["Pedro" "Paulo" "Julia" "Joao" "Marcelo"])

(defn salutation
  "Given some period, return the correspondent salutation"
  [period]
  (case period
    "afternoon" "good afternoon"
    "night" "good evening"
    "good morning"))

; Tests
(println "Exercise 1")
(println (salutation "morning"))

(println "")

(defn mdc
  "Calculate the greatest common divisor (GCD) between a and b"
  [a b]
  (if (= (mod a b) 0)
    b
    (mdc b (mod a b))))

(defn coprime?
  "Check if a and b are coprimes"
  [a b]
  (= 1 (mdc a b)))

; Tests
(println "Exercise 2")
(println (coprime? 3 5))
(println (coprime? 3 6))

(println "")

(defn sum
  "Return the sum of a and b, or throw an exception"
  [a b]
  (try (+ a b)
       (catch Exception _
         (throw (Exception. "Wrong data type. Must be a number. ")))))

; Tests
(println "Exercise 3")
(println (sum 3 5))
; (println (sum 3 "1"))

(println "")

(defn write-in-file
  "Write the list's names in the file"
  [names]
  (try (io/delete-file "names.txt")
       (catch Exception _ (println "Creating new file..."))
       (finally (with-open [wrtr (io/writer "names.txt" :append true)]
                  (dotimes [i (count names)] (if (= i (dec (count names)))
                                               (.write wrtr (get names i))
                                               (.write wrtr (str (get names i) ", "))))))))

; Tests
; (println "Exercise 4")
(write-in-file names)

(println "")
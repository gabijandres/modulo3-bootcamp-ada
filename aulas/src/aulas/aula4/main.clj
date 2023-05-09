(ns aulas.aula4.main
  (:require [clojure.java.io :as io]))

(def names ["Pedro" "Paulo" "Julia" "Joao" "Marcelo"])

(defn salutation
  "Given some period, return the correspondent salutation"
  [period]
  (case period
    "tarde" "boa tarde"
    "noite" "boa noite"
    "bom dia"))

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

(defn sum
  "Return the sum of a and b, or throw an exception"
  [a b]
  (try (+ a b)
       (catch Exception _
         (throw (Exception. "Wrong data type. Must be a number. ")))))

(defn write-in-file [names]
  (try (io/delete-file "names.txt")
       (catch Exception _ (println "Creating new file..."))
       (finally (with-open [wrtr (io/writer "names.txt" :append true)]
                  (dotimes [i (count names)] (if (= i (dec (count names)))
                                               (.write wrtr (get names i))
                                               (.write wrtr (str (get names i) ", "))))))))
(ns aulas.aula6.main)

; Q1

(def numbers [1 2 3 4])

(defn calculateAverage
  "Calculate and return the average between the numbers in list"
  [numbers]
  (when (seq numbers)
    (as-> numbers n
          (apply + n)
          (/ (double n) (count numbers)))))

; Testes
(println "Exercise 1")
(println (calculateAverage numbers))
(println (calculateAverage []))

(println "")

; Q2

(defn readFromConsole
  "Read a line from std input and return the line value"
  []
  (println "Type something: ")
  (read-line))

; Testes
(println "Exercise 2")
(println (str "The input was: " (readFromConsole)))

(println "")

; Q3

(defn calculateTwiceSum
  "Calculate and return twice the sum of num1 and num2"
  [num1 num2]
  ((comp #(* 2 %) +) num1 num2))

; Testes
(println "Exercise 3")
(println (calculateTwiceSum 2 5))

(println "")

; Q4

(def relogio (java.util.Date.))
; (def relogio2 (java.time.LocalDateTime/now))

(defn getDate
  "Given a clock instance, return the actual date and hour"
  [relogio]
  (.toString relogio))

; Testes
(println "Exercise 4")
(println (getDate relogio))
; (println (getDate relogio2))

(println "")

; Q5

(def fruits-list ["banana" "apple"])

(defn addElement
  "Add element in the list and return the new generated list"
  [original-list element]
  (conj original-list element))

; Testes
(println "Exercise 5")
(println (str "Original list: " fruits-list))
(println (str "New list: " (addElement fruits-list "watermellon")))

(println "")

; Q6

(defn write-in-file
  "Write the message in file"
  [file-name message]
  (try
    (spit file-name message)
    "Message wrote in file succesfully"
    (catch Exception _
      (throw (Exception. "There was an error writing in file")))))

; Testes
(println "Exercise 6")
(println (write-in-file "file.txt" "Test Q6"))
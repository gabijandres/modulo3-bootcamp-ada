(ns aula2.core
  (:require [aula2.areas :as areas]))

(defn get-random-int
  "Returns a random integer between 1 (inclusive) and max (inclusive)"
  [max]
  (inc (rand-int max)))

(defn square-area-example
  "Calculate square area with some random size"
  [max-size]
  (let [size (get-random-int max-size)]
    (println (str "Lado: " size))
    (println (str "Área do quadrado: " (areas/square-area size)))))

(defn triangle-area-example
  "Calculate triangle area with some random base and height"
  [max-base max-height]
  (let [base (get-random-int max-base)
        height (get-random-int max-height)]
    (println (str "Base: " base))
    (println (str "Altura: " height))
    (println (str "Área do triângulo: " (areas/triangle-area base height)))))

(defn rectangle-area-example
  "Calculate rectangle area with some random base and height"
  [max-base max-height]
  (let [base (get-random-int max-base)
        height (get-random-int max-height)]
    (println (str "Base: " base))
    (println (str "Altura: " height))
    (println (str "Área do retângulo: " (areas/rectangle-area base height)))))

(defn circle-area-example
  "Calculate circle area with some random radius"
  [max-radius]
  (let [radius (get-random-int max-radius)]
    (println (str "Raio: " radius))
    (println (str "Área do círculo: " (areas/circle-area radius)))))

(defn trapeze-area-example
  "Calculate trapeze area with some random major base, minor base and height"
  [max-major-base max-minor-base max-height]
  (let [major-base (get-random-int max-major-base)
        minor-base (get-random-int max-minor-base)
        height (get-random-int max-height)]
    (println (str "Base Maior: " major-base))
    (println (str "Base Menor: " minor-base))
    (println (str "Altura: " height))
    (println (str "Área do trapézio: " (areas/trapeze-area major-base minor-base height)))))

(square-area-example 10)
(println "----------------------------------")

(triangle-area-example 10 10)
(println "----------------------------------")

(rectangle-area-example 10 10)
(println "----------------------------------")

(circle-area-example 10)
(println "----------------------------------")

(trapeze-area-example 10 10 10)
(println "----------------------------------")
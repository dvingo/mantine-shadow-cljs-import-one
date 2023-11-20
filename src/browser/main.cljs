(ns browser.main
  (:require
   ["react" :as react]
   ["react-dom/client" :as react-dom]
   ["@mantine/core/cjs/core/MantineProvider/MantineProvider.js" :as MantineProvider]
  ;;  ["@mantine/core" :as mantine]
   ))

(js/console.log "mantine:" MantineProvider)

(defonce root (react-dom/createRoot js/app))

(defn $ [type & args]
  (let [?p (first args), ?c (rest args), type' (cond-> type (keyword? type) name)]
    (if (map? ?p)
      (apply react/createElement type' (clj->js ?p) ?c)
      (apply react/createElement type' nil args))))

(defn app 
  []
  ($ MantineProvider 
     ($ :div "hi")))

(defn init []
  (.render root ($ app) ))

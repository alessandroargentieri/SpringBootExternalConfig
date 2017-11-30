
Andare da terminale nella cartella contenente il Jar del progetto e runnare il jar con:
    java -jar NOMEFILE.jar


Se nella cartella suddetta sono contenute le application.properties o sono inserite in config, allora la web app userà queste nuove configurazioni.
Se togliamo il file application.properties dalla cartella del jar, la web app userà quelle di default contenute nel codice sorgente in resources.

Andare su browser e fare la prova: localhost/8183/hello

Se ci sono le application.properties esterne dice "Hello Alex!", altrimenti "Hello Arcibaldo!"

Questa funzionalitaà rende possibile utilizzare le configurazioni esterne relative all'ambiente specifico di deploy sia per la porta, per il database ecc.

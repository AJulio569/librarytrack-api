# 🤝 Guía de Contribución

¡Bienvenido y muchas gracias por tu interés en contribuir a este proyecto! Tu ayuda es muy valiosa para nosotros. Por favor, tómate un momento para leer estas directrices antes de hacer un **_Pull Request_**.

## 1. ¿Cómo empezar?

### Requisitos

Antes de empezar, asegúrate de tener:
* Un IDE como **IntelliJ IDEA** o **VS Code**.
* **Java 17** o una versión superior instalada.
* **Git** configurado en tu máquina.

### Clonar el repositorio

Si es tu primera vez, el proceso que recomendamos es el siguiente:

1.  **Haz un _Fork_** de este repositorio en tu cuenta de GitHub.
2.  **Clona tu _Fork_** en tu máquina local.
    ```bash
    git clone [https://github.com/tu-usuario/nombre-del-repositorio.git](https://github.com/tu-usuario/nombre-del-repositorio.git)
    cd nombre-del-repositorio
    ```
3.  **Configura el repositorio original** como "upstream" para poder sincronizarte con los últimos cambios.
    ```bash
    git remote add upstream [https://github.com/el-propietario/nombre-del-repositorio.git](https://github.com/el-propietario/nombre-del-repositorio.git)
    ```

---

## 2. Proceso de contribución

El proceso que seguimos se basa en la creación de una rama para cada nueva funcionalidad o corrección de error.

1.  **Sincroniza tu _Fork_**: Antes de empezar a trabajar, asegúrate de que tu rama `main` local esté actualizada con los últimos cambios del repositorio principal.
    ```bash
    git checkout main
    git pull upstream main
    git push origin main
    ```
2.  **Crea una nueva rama** para tu trabajo. Usa un nombre descriptivo para tu rama (por ejemplo, `feat/agregar-autor-entidad` o `fix/cors-config-error`).
    ```bash
    git checkout -b nombre-de-tu-rama
    ```
3.  **Realiza tus cambios**: Escribe el código, las pruebas unitarias y asegúrate de que todo funcione correctamente.
4.  **Haz _Commit_ de tus cambios**: Utiliza mensajes de _commit_ claros y concisos que expliquen lo que hiciste.
    ```bash
    git add .
    git commit -m "feat: agrega la entidad Author y sus endpoints"
    ```
5.  **Envía tu rama** a tu _Fork_.
    ```bash
    git push origin nombre-de-tu-rama
    ```
6.  **Abre un _Pull Request_**: Ve a la página de tu _fork_ en GitHub y crea un _pull request_ desde tu rama hacia la rama `main` del repositorio original.
    * Proporciona una descripción clara de los cambios.
    * Menciona los **issues** relacionados si los hay (`Fixes #123`).
    * Si es algo visual o afecta al comportamiento de la API, no olvides adjuntar capturas de pantalla.

---

## 3. Guías de estilo

* **Formato de Código**: Sigue el estilo de código del proyecto para mantener la consistencia. Si se utiliza alguna herramienta de formato, por favor, úsala.
* **Pruebas**: Toda nueva funcionalidad debe venir acompañada de **pruebas unitarias** que garanticen su correcto funcionamiento y eviten regresiones.
* **Mensajes de _Commit_**: Utiliza un formato claro como `tipo: descripción`. Los tipos comunes son `feat` (funcionalidad), `fix` (corrección de error), `docs` (documentación), etc.

---

Con este archivo `CONTRIBUTING.md`, tu proyecto está mucho mejor preparado para recibir colaboraciones. Ya hemos cubierto las dos partes más importantes para empezar: el `README.md` y la guía de contribución.

Ahora, ¿te gustaría que pasemos a la **Wiki** para documentar los endpoints y la arquitectura en profundidad, o tienes alguna otra pregunta sobre el proceso de contribución?
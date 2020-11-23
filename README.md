## Задача №3 (необязательная) - "Цикломатическая сложность кода"

Важно: данная задача не является обязательной! Её не выполнение не влияет на получение зачёта по ДЗ.

### Легенда

Когда вы разбирались с JaCoCo, одним из счётчиков являлся счётчик, ответственный за подсчёт сложности кода.

На базе значения этой метрики можно вычислить количество unit-тестов, необходимых для покрытия определённого метода.

Настройте JaCoCo (если требуется) на подсчёт этой метрики для второй задачи (нас интересуют только методы для обработки `next` и `prev`) и удостоверьтесь, что для этих методов кол-во ваших unit-тестов совпадает с рекомендациями метрики.

В `README.md` репозитория второй задачи опишите:
1. Формулу вычисления количества unit-тестов на основании значений, генерируемых JaCoCo
1. Рекомендуемый порог цикломатической сложности кода (необходимо провести небольшое исследование)

В качестве отправной точки при проведении ваших исследований используйте:
1. Сайт JaCoCo
1. Википедию ([статья о цикломатической сложности кода](https://ru.wikipedia.org/wiki/%D0%A6%D0%B8%D0%BA%D0%BB%D0%BE%D0%BC%D0%B0%D1%82%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B0%D1%8F_%D1%81%D0%BB%D0%BE%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C))

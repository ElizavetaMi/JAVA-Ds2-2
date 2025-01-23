public class Main {
    public static void main(String[] args) {
        // Начальный счёт клиента
        int initialBalance = 100;

        // Сумма пополнения
        int refillAmount = 1100;

        // Порог для начисления бонусов
        int bonusThreshold = 1000;

        // Количество рублей для начисления одного бонусного рубля
        int rublesPerBonus = 100;

        // Переменная для хранения количества бонусов
        int bonus = 0;

        // Проверяем, превышает ли сумма пополнения порог
        if (refillAmount > bonusThreshold) {
            bonus = refillAmount / rublesPerBonus;
        }

        // Рассчитываем итоговый баланс
        int finalBalance = initialBalance + refillAmount + bonus;

        // Вывод результата
        System.out.println("Итоговый баланс: " + finalBalance + " рублей");
        System.out.println("Начислено бонусов: " + bonus + " рублей");
    }
}
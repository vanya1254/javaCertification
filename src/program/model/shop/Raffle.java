package program.model.shop;

import program.model.toys.Toy;

import java.util.ArrayList;
import java.util.List;

public class Raffle {
    private final static String EMPTY_RAFFLE = "\nAll toys were received!\n";
    private List<Toy> raffle;
    private Shop shop;


    public Raffle(Shop shop) {
        this.raffle = new ArrayList<>();
        this.shop = shop;
    }

    /*
     Определяем игрушку по принципу:
     count * chance, у какой игрушки это значение выше, ту и добавляем в raffle
     предварительно уменьшив count данной игрушки
     */
    public boolean drawToy() {
        if (this.shop.getStore().size() != 0) {
            int indexToy = 0;
            Toy prize = this.shop.getStore().get(0);
            int maxChance = this.shop.getCountToys() * this.shop.getStore().get(0).getCount();
            for (int i = 1; i < this.shop.getTotal(); i++) {
                if (maxChance < this.shop.getCountToys() * this.shop.getStore().get(i).getCount()) {
                    maxChance = this.shop.getCountToys() * this.shop.getStore().get(i).getCount();
                    prize = this.shop.getStore().get(i);
                    indexToy = i;
                }
            }
            this.shop.getStore().get(indexToy).setCount(prize.getCount() - 1);
            prize.setCount(prize.getCount());
            this.raffle.add(prize);
            return true;
        } return false;
    }

    /*
    Вручаем игрушку(выводим в консоль и записываем в raffle) и удаляем из raffle
     */
    public Toy giveToy() {
        if (this.raffle.size() != 0) {
            System.out.printf("\n Your gift --> %s\n\n", this.raffle.get(0).getName());
            return this.raffle.remove(0);
        } else System.out.println(EMPTY_RAFFLE);
        return null;
    }
}

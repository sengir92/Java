public class Match {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {
            if(whoStart()) {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("----- New Round -----");
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()) {
                        break;
                    }

                    this.f1.health = this.f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    System.out.println(this.f1.name + " Health: " + f1.health);
                    System.out.println(this.f2.name + " Health: " + f2.health);

                }
            }


        } else {
            System.out.println("Fighters weights don't match ! ");
        }

    }

    boolean isCheck() {

        return ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight));

    }

    boolean whoStart() {
        double start = Math.random() * 100;
        if (start < 50) {
            System.out.println(f1.name + " start");
            return true;
        } else {
            System.out.println(f2.name + " start");
            return true;
        }
    }
    boolean isWin() {
            if(this.f1.health == 0) {
                System.out.println(this.f2.name + " Wins !");
                return  true;
            }
            if(this.f2.health == 0) {
                System.out.println(this.f1.name + " Wins !");
                return  true;
            }
            return  false;
        }

    }

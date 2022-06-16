public class Car extends Transport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);

    }
@Override
    public void updateTyre() {

        System.out.println("Меняем покрышку машины");
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель машины");
    }

    @Override
    public void check() {
            System.out.println("Обслуживаем " + this.getModelName());
            for (int i = 0; i < this.getWheelsCount(); i++) {
                this.updateTyre();
            }
            this.checkEngine();
        }
    }



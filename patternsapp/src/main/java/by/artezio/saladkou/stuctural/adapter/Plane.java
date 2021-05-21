package by.artezio.saladkou.stuctural.adapter;

public interface Plane {

    void moveLeverArm(Direction direction);

    enum Direction {
        RIGHT {
            @Override
            String getTitle() {
                return "right";
            }
        },
        LEFT {
            @Override
            String getTitle() {
                return "left";
            }
        },
        FORWARD {
            @Override
            String getTitle() {
                return "forward";
            }
        },
        BACK {
            @Override
            String getTitle() {
                return "back";
            }
        };

        abstract String getTitle();
    }
}

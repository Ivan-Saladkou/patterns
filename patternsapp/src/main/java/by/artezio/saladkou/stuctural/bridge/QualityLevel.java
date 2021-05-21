package by.artezio.saladkou.stuctural.bridge;

public enum QualityLevel {

    PERFECTLY {
        @Override
        public String getTitle() {
            return "perfectly";
        }
    },
    PRETTY_GOOD {
        @Override
        public String getTitle() {
            return "pretty good";
        }
    },
    HARDLY {
        @Override
        public String getTitle() {
            return "hardly";
        }
    };

    public abstract String getTitle();
}

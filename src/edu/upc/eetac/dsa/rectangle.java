package edu.upc.eetac.dsa;

    public class rectangle extends Figure {
        private double l1,l2;

        public rectangle(double l1,double l2)
        {
            this.l1 = l1;
            this.l2 = l2;
        }
        public double area()
        {
            return l1*l2;
        }

        @Override
        public int compareTo(Figure figure) {
            return 0;
        }
    }


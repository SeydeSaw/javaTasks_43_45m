package lessons._21_mar_23;
/*todo
    4. Энам рейтинг
    если рейтинг A то +20%
    B +15%
    C +5%
    D 0%
    E -5%
 */
public enum Rating {
    A(20),
    B(15),
    C(5),
    D(0),
    E(-5);

    private  int rating;

    Rating(int rating) {
        this.rating = rating;
    }

}

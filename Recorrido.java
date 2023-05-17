public interface Recorrido {
    /**
     * Alimentar a los perros
     * @return mensaje de alimentar a los perros
     */
    String alimentar();
    /**
     * Cepilla a los perros
     * @return mensaje de cepillar a los perros
     */
    String cepillar();
    /**
     * Actividad extra
     * @return mensaje de la actividad extra
     */
    String extra();
    /**
     * Mensaje del recorrido completo
     * @return recorrido completo
     */
    String recorrido();
}

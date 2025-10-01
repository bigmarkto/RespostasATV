class AdaptadorTemperatura implements ConversorTemperatura {
    private ConversorCelsius conversorCelsius;

    public AdaptadorTemperatura() {
        this.conversorCelsius = new ConversorCelsius();
    }

    @Override
    public double celsiusParaFahrenheit(double celsius) {
        return conversorCelsius.converterParaFahrenheit(celsius);
    }
    @Override
    public double fahrenheitParaCelsius(double fahrenheit) {
        // Implementação inversa
        return (fahrenheit - 32) * 5/9;
    }
}
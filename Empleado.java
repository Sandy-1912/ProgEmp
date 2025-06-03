public class Empleado {
    private int id;
    private String codigo;
    private String nombre;
    private String apellido;
    private String departamento;
    private double salario;

    // Constructor
    public Empleado(int id, String codigo, String nombre, String apellido, String departamento, double salario) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.departamento = departamento;
        this.salario = salario;
    }

    // Getters
    public int getId() { return id; }
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getDepartamento() { return departamento; }
    public double getSalario() { return salario; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }
    public void setSalario(double salario) { this.salario = salario; }
}
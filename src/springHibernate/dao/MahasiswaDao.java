package springHibernate.dao;

import java.util.List;
import springHibernate.model.Mahasiswa;


public interface MahasiswaDao {
    public void save(Mahasiswa mahasiswa);
    public void update(Mahasiswa mahasiswa);
    public void delete(Mahasiswa mahasiswa);
    public Mahasiswa getMahasiswa(String npm);
    public List<Mahasiswa> getMahasiswas();
}
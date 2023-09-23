package views;

public class Format {
  private String nombre;

  public Format(String nombre) {
    this.nombre = nombre;
  }

  public Format() {
  }

  public String getNombre() {
    return nombre;
  }

  public Format[] formatos() {
    Format[] formatos = new Format[] { new views.Format("afgano-afgana"),
        new views.Format("alemán-alemana"),
        new views.Format("árabe-árabe"), new views.Format("argentino-argentina"),
        new views.Format("australiano-australiana"), new views.Format("belga-belga"),
        new views.Format("boliviano-boliviana"),
        new views.Format("brasileño-brasileña"), new views.Format("camboyano-camboyana"),
        new views.Format("canadiense-canadiense"), new views.Format("chileno-chilena"), new views.Format("chino-china"),
        new views.Format("colombiano-colombiana"), new views.Format("coreano-coreana"),
        new views.Format("costarricense-costarricense"), new views.Format("cubano-cubana"),
        new views.Format("danés-danesa"),
        new views.Format("ecuatoriano-ecuatoriana"), new views.Format("egipcio-egipcia"),
        new views.Format("salvadoreño-salvadoreña"), new views.Format("escocés-escocesa"),
        new views.Format("español-española"),
        new views.Format("estadounidense-estadounidense"), new views.Format("estonio-estonia"),
        new views.Format("etiope-etiope"), new views.Format("filipino-filipina"),
        new views.Format("finlandés-finlandesa"), new views.Format("francés-francesa"),
        new views.Format("galés-galesa"), new views.Format("griego-griega"),
        new views.Format("guatemalteco-guatemalteca"),
        new views.Format("haitiano-haitiana"), new views.Format("holandés-holandesa"),
        new views.Format("hondureño-hondureña"), new views.Format("indonés-indonesa"),
        new views.Format("inglés-inglesa"),
        new views.Format("iraquí-iraquí"), new views.Format("iraní-iraní"), new views.Format("irlandés-irlandesa"),
        new views.Format("israelí-israelí"), new views.Format("italiano-italiana"),
        new views.Format("japonés-japonesa"), new views.Format("jordano-jordana"),
        new views.Format("laosiano-laosiana"), new views.Format("letón-letona"), new views.Format("letonés-letonesa"),
        new views.Format("malayo-malaya"),
        new views.Format("marroquí-marroquí"), new views.Format("mexicano-mexicana"),
        new views.Format("nicaragüense-nicaragüense"), new views.Format("noruego-noruega"),
        new views.Format("neozelandés-neozelandesa"), new views.Format("panameño-panameña"),
        new views.Format("paraguayo-paraguaya"), new views.Format("peruano-peruana"), new views.Format("polaco-polaca"),
        new views.Format("portugués-portuguesa"), new views.Format("puertorriqueño-puertorriqueño"),
        new views.Format("dominicano-dominicana"), new views.Format("rumano-rumana"), new views.Format("ruso-rusa"),
        new views.Format("sueco-sueca"), new views.Format("suizo-suiza"), new views.Format("tailandés-tailandesa"),
        new views.Format("taiwanes-taiwanesa"), new views.Format("turco-turca"),
        new views.Format("ucraniano-ucraniana"), new views.Format("uruguayo-uruguaya"),
        new views.Format("venezolano-venezolana"), new views.Format("vietnamita-vietnamita")
    };
    return formatos;
  }

  @Override
  public String toString() {
    return nombre;
  }

}
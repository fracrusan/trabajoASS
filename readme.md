Trabajo ASS: DNL
=======================

El trabajo se compone de un proceso general que contiene los siguientes subprocesos:

- Valoración subjetiva: A realizar por el paciente, se basa en un formulario y, a partir de su resultado, se obtiene una puntuación que ayude al diagnóstico de DNL.
  -    Variables del proceso: Salidas: scale de tipo DN4Patient.
                              Entradas: No hay.
  -  DN4Patient: Objeto de datos
 

- Valoración Objetiva: A realizar por el facultativo.
  - Variables del proceso:
      - Entrada: id del paciente.
      - Salida: DNLDiagnosticado: Boolean indicando si es DNL. 
    - Actividades:
      - Work Item: Petición a EHR para 
  

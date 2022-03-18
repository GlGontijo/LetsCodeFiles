
# <p align='center'>Projeto final</p>

## Flights Information
<BR>

### Arquivo de entrada:

origin;destination;airline;departure;arrival;price

_MEL-Austrália;GRU-Brasil;Gol Airlines;21/04/2022 06:00:00 (+01:00);22/04/2022 02:00:00 (+04:00);3758.00 KIN-Jamaica;PEK-China;Lufthansa;10/04/2022 12:00:00 (+10:00);10/04/2022 04:00:00 (-02:00);4842.00_
<BR><BR>

### Objetivos: 

Calcular tempo de vôo em horas de cada vôo. Agrupar vôos por origem/destino e ordená-los por tempo de vôo (crescente), preco (crescente), nome da companhia (crescente) Criar 2 arquivos de saída:

### 1º <BR>
Contendo toda a relação de vôos mantendo as colunas originais e incluindo uma nova coluna contendo o tempo do vôo (manter ordenação acima)
<BR>
### 2º <BR>
Contendo um resumo de informações:
- Vôo mais rapido por origem/destino
- Vôo mais longo por origem/destino
- Vôo mais barato por origem/destino
- Tempo médio de vôo origem/destino
- Preço médio por origem/destino
<BR><BR>

### Detalhes:

A Data/Hora estão com o fuso horário, de acordo com o seguinte formato: _dia/mes/ano hora:minuto:segundo (fuso horário)_. 
<BR>Ex.: 13/03/2022 10:15:30 (-03:00)
<BR>Price: em reais (R$)
<BR>Utilizar a API Java Time.
<BR>Utilizar a API IO ou NIO ou NIO2 para leitura e escrita de arquivos.
<BR>Utilizar mandatoriamente Streams/Lambdas para realizar operações sobre os elementos do arquivo: desde agrupamentos, cálculo de tempo de vôo até o cálculo das informações do resumo.
<BR>Arquivos de entrada e saída no formato ".csv", charSet UTF-8.
<BR>Caracter separador de colunas: ";"
<BR>Cabeçalhos dos arquivos gerados:

**1º arquivo:** origin;destination;airline;departure;arrival;price;time

| origin | destination | airline | departure | arrival | price | time |
|--------|-------------|---------|-----------|---------|-------|------|


**2º arquivo:** origin;destination;shortest_flight(h);longest_fight(h);cheapest_flight;most_expensive_flight;average_time;average_price

| origin | destination | shortest_flight(h) | longest_fight(h) | cheapest_flight | most_expensive_flight | average_time | average_price |
|--------|-------------|--------------------|------------------|-----------------|-----------------------|--------------|---------------|
  
  

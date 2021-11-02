<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Mes</name>
   <tag></tag>
   <elementGuidId>f30d8875-2347-4a8a-ba51-b39b7a27a18b</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//form[@id='form_calendarioEventoBienestar']/div</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>div.caja_contenido</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>caja_contenido</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
			MesSemanaDíaoctubre 2021lun.mar.mié.jue.vie.sáb.dom.272829301234567891011121314151617181920212223242526272829303112345675 Momento Evento: Prueba-S5 Momento Evento: Prueba-SEvento





Descripción: 



Inicio: 



Fin: 







Ver




			

			jQuery(document).ready(	function() {
				
				requireScript(&quot;/saraweb/javax.faces.resource/fullcalendar/moment.min.js.jsf?ln=js&quot;);
				requireScript(&quot;/saraweb/javax.faces.resource/fullcalendar/fullcalendar.min.js.jsf?ln=js&quot;);
				requireScript(&quot;/saraweb/javax.faces.resource/fullcalendar/locale/es.js.jsf?ln=js&quot;);
				
				var eventosJSONdeServidor=&quot;[{\&quot;id\&quot;:0,\&quot;title\&quot;:\&quot;Momento Evento: Prueba-S\&quot;,\&quot;start\&quot;:\&quot;2021-11-02T05:00:00.000Z\&quot;,\&quot;end\&quot;:\&quot;2021-11-02T06:00:00.000Z\&quot;,\&quot;color\&quot;:\&quot;#FD7511\&quot;,\&quot;allDay\&quot;:false,\&quot;llaveEvento\&quot;:\&quot;dd827d457a2448acb959ab9dca2ce984\&quot;,\&quot;editable\&quot;:false,\&quot;fechaInicio\&quot;:\&quot;Nov 2, 2021 5:00:00 AM\&quot;,\&quot;fechaFin\&quot;:\&quot;Nov 2, 2021 6:00:00 AM\&quot;},{\&quot;id\&quot;:1,\&quot;title\&quot;:\&quot;Momento Evento: Prueba-S\&quot;,\&quot;start\&quot;:\&quot;2021-11-09T05:00:00.000Z\&quot;,\&quot;end\&quot;:\&quot;2021-11-09T06:00:00.000Z\&quot;,\&quot;color\&quot;:\&quot;#FD7511\&quot;,\&quot;allDay\&quot;:false,\&quot;llaveEvento\&quot;:\&quot;dd827d457a2448acb959ab9dca2ce984\&quot;,\&quot;editable\&quot;:false,\&quot;fechaInicio\&quot;:\&quot;Nov 9, 2021 5:00:00 AM\&quot;,\&quot;fechaFin\&quot;:\&quot;Nov 9, 2021 6:00:00 AM\&quot;},{\&quot;id\&quot;:2,\&quot;title\&quot;:\&quot;Momento Evento: Prueba-S\&quot;,\&quot;start\&quot;:\&quot;2021-11-03T05:00:00.000Z\&quot;,\&quot;end\&quot;:\&quot;2021-11-03T06:00:00.000Z\&quot;,\&quot;color\&quot;:\&quot;#FD7511\&quot;,\&quot;allDay\&quot;:false,\&quot;llaveEvento\&quot;:\&quot;dd827d457a2448acb959ab9dca2ce984\&quot;,\&quot;editable\&quot;:false,\&quot;fechaInicio\&quot;:\&quot;Nov 3, 2021 5:00:00 AM\&quot;,\&quot;fechaFin\&quot;:\&quot;Nov 3, 2021 6:00:00 AM\&quot;},{\&quot;id\&quot;:3,\&quot;title\&quot;:\&quot;Momento Evento: Prueba-S\&quot;,\&quot;start\&quot;:\&quot;2021-11-10T05:00:00.000Z\&quot;,\&quot;end\&quot;:\&quot;2021-11-10T06:00:00.000Z\&quot;,\&quot;color\&quot;:\&quot;#FD7511\&quot;,\&quot;allDay\&quot;:false,\&quot;llaveEvento\&quot;:\&quot;dd827d457a2448acb959ab9dca2ce984\&quot;,\&quot;editable\&quot;:false,\&quot;fechaInicio\&quot;:\&quot;Nov 10, 2021 5:00:00 AM\&quot;,\&quot;fechaFin\&quot;:\&quot;Nov 10, 2021 6:00:00 AM\&quot;}]&quot;;
				
				function guardarEventoParaServidor(evento){
					jQuery(&quot;.valor_seleccionado input[type=hidden]&quot;).val(JSON.stringify(evento));
				}
				
				function crearEvento(eventoCalendario){
					var evento = {
							id: eventoCalendario.id,
							start: eventoCalendario.start,
							end: eventoCalendario.end,
							title: eventoCalendario.title,
							allDay: eventoCalendario.allDay,
							llaveEvento: eventoCalendario.llaveEvento
					}
					return evento;
				}
				
				function llenarInfoPopup(eventoCalendario){
					console.log(eventoCalendario);
					jQuery(&quot;.descripcion_evento&quot;).html(eventoCalendario.title);
					jQuery(&quot;.inicio_evento&quot;).html(eventoCalendario.start.format(&quot;YYYY-MM-DD HH:mm&quot;));
					jQuery(&quot;.fin_evento&quot;).html(eventoCalendario.end != null? eventoCalendario.end.format(&quot;YYYY-MM-DD HH:mm&quot;) : eventoCalendario.start.format(&quot;YYYY-MM-DD HH:mm&quot;));
				}
				
				function editarEvento(event, delta, revertFunc) {
					if(!event.editable){
						alert(&quot;No tiene permiso para editar este evento&quot;);
						revertFunc();
						return;
					}
					var eventoCalendario = crearEvento(event);
					guardarEventoParaServidor(eventoCalendario);
					document.getElementsByClassName(&quot;boton_calendario_editar&quot;)[0].click();
				}
				
				if (eventosJSONdeServidor){
				console.log(eventosJSONdeServidor);
				var eventos = jQuery.parseJSON(eventosJSONdeServidor);
				console.log(eventos);
				fech = document.getElementsByClassName(&quot;fechacronog&quot;)[0].value;
				if (!fech){
					var actual = new Date();
					var an = actual.getFullYear()+&quot;&quot;;
					var mes = actual.getMonth() + 1;
					if (mes % 10 == mes){
						mes=&quot;0&quot; + mes;
					}
					var dia = actual.getDate();
					if (dia % 10 == dia){
						dia=&quot;0&quot; + dia;
					}
					fech = an + &quot;-&quot; + mes + &quot;-&quot; + dia;
					console.log(&quot;nuevafecha &quot;, fech);
				}
				jQuery(&quot;.calendario_union&quot;).fullCalendar({
					 		defaultDate: moment(fech),
							events : eventos,
							selectable: true,
							selectHelper: true,
							editable: true,
							header: {
								left: 'prev,next',
								center: 'title',
								right: &quot;month,agendaWeek,agendaDay&quot;
							},
							defaultView: &quot;agendaWeek&quot;,
							//Función encargada de preparar y mmostrar la información de un evento clickeado en el calendario
							eventClick: function(calEvent, jsEvent, view) {
								var start = calEvent.start;
						        var end = calEvent.end || start;
								var eventoAVer = crearEvento(calEvent);
								guardarEventoParaServidor(eventoAVer);
								llenarInfoPopup(calEvent);
								if (eventoAVer.title != 'Festivo'){
									PF('popupVerEvento').show();
								}
							},
							//Función encargada de preparar información de una franja de fechas para crear un evento nuevo
							select: function(start, end) {
								var eventoAVer = {
										start: start,
										end: end
								}
								guardarEventoParaServidor(eventoAVer);
								document.getElementsByClassName(&quot;boton_calendario_nuevo&quot;)[0].click();
								jQuery(&quot;.calendario_union&quot;).fullCalendar('unselect');
							},
							//Función encargada de manejar el cambio de duración de un evento o cambio de ubicación del evento, verifica si es editable 
							eventResize: editarEvento,
							eventDrop: editarEvento							
					});
				}
				console.log('Status Calendar: 128863 - 4');
		});
			
			</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;form_calendarioEventoBienestar&quot;)/div[@class=&quot;caja_contenido&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//form[@id='form_calendarioEventoBienestar']/div</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Final Desarrollo'])[1]/following::div[2]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Inicial Desarrollo'])[1]/following::div[3]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//span/span/form/div</value>
   </webElementXpaths>
</WebElementEntity>

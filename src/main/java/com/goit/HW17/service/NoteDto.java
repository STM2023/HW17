package com.goit.HW17.service;


import lombok.Data;

@Data
public class NoteDto {


        private long id;
        //   private UUID id;

        private String title;

        private String content;


}

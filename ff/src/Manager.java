import model.Epic;
import model.SubTask;
import model.Task;
import model.TaskStatus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * содержит CRUD методами
 */
public class Manager {

    public static Long taskMaxId = 0L;

    private final Map<Long, Epic>  epics = new HashMap<>(); // Создаю мап для эпиков: ключ(id), значение(эпик)
    private final Map<Long, Task> tasks = new HashMap<>();
    private final Map<Long, SubTask> subTasks = new HashMap<>();

    /**
     * Получаю все значения эпик в формате листа
     *
     * @return лист эпиков
     */
    public List<Epic> getAllEpic() {
        return (List<Epic>) epics.values();
    }

    /**
     * удаляю все сабтаски и эпики
     */
    public void clearEpic() {
        clearSubtask();
        epics.clear();
    }

    /**
     * возращает значение ключа эпика
     *
     * @param id
     * @return
     */
    public Epic getEpicById(Long id) {
        return epics.get(id);
    }

    /**
     * добавляю новый эпик в мапу
     *
     * @param epic принимаем эпик
     * @return возвращает добавленный в мапу эпик
     */
    public Epic addEpic(Epic epic) {
        epics.put(epic.getId(), epic);
        return epic;
    }

    /**
     * Проверят наличие эпика в мапе и если он есть, обноваляет его
     *
     * @param epic эпик
     */
    public void updateEpic(Epic epic) {
        if (epics.containsKey(epic.getId())) {
            epics.put(epic.getId(), epic);
        }
    }

    /**
     * @param id
     * @return
     */
    public Epic removeEpicById(Long id) {
        for (SubTask subTask : epics.get(id).getSubTaskList()) {
            subTasks.remove(subTask.getId());
        }
        return epics.remove(id);
    }

    public List<SubTask> getAllSubTask() {
        return (List<SubTask>) subTasks.values();
    }

    public void clearSubtask() {
        subTasks.clear();
    }

    public SubTask getSubTaskById(Long id) {
        return subTasks.get(id);
    }

    public SubTask addSubTask(SubTask subTask) {
        subTasks.put(subTask.getId(), subTask);
        return subTask;
    }

    public SubTask removeSubTaskById(Long id) {
        Epic epic = subTasks.get(id).getEpic();
        if (epic.getSubTaskList().size() == 1) {
            epic.setStatus(TaskStatus.DONE);
        }
        return subTasks.remove(id);
    }

    public SubTask updateSubTask(SubTask subTask) {
        Epic epic = subTask.getEpic();
        boolean isDone = false;
        for (SubTask subTask1 : epic.getSubTaskList()) {
            if (!subTask1.getStatus().equals(TaskStatus.DONE)) {
                isDone = true;
                break;
            }
        }
        if (!isDone && subTask.getStatus().equals(TaskStatus.DONE)) {
            epic.setStatus(TaskStatus.DONE);
        }
        return subTasks.put(subTask.getId(), subTask);
    }

    public List<Task> getAllTask() {
        return (List<Task>) tasks.values();
    }

    public void clearTask() {
        tasks.clear();
    }

    public Task getTaskById(Long id) {
        return tasks.get(id);
    }

    public Task addTask(Task task) {
        tasks.put(task.getId(), task);
        return task;
    }

    public Task removeTaskById(Long id) {
        return tasks.remove(id);
    }

    public Task updateTask(Task task) {
        return tasks.put(task.getId(), task);
    }

    public List<SubTask> getAllSubtaskByEpic(Epic epic) {
        return epic.getSubTaskList();
    }
}
